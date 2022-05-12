package pl.sda.academy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    private static final String EXAMPLE_DATA = "hello sda";

    private static Connection connection;
    private Storage storage;

    @BeforeAll
    static void beforeAll() throws InterruptedException {
        connection = new Connection();
        connection.open();
    }

    @AfterAll
    static void afterAll() throws InterruptedException {
        connection.close();
    }

    @BeforeEach
    void beforeEach() {
        storage = new Storage(connection);
    }

    @AfterEach
    void afterEach() {
        connection.refresh();
    }

    @Test
    void shouldAddDataToStorage() {
        // given

        // when
        int actualSize = storage.addValue(EXAMPLE_DATA);

        // then
        assertEquals(1, actualSize);
        assertTrue(storage.getData().contains(EXAMPLE_DATA));
    }

    @Test
    void shouldRemoveExistingData() {
        // given
        storage.addValue(EXAMPLE_DATA);

        // when
        boolean actualResult = storage.removeValue(EXAMPLE_DATA);

        // then
        assertTrue(actualResult);
        assertFalse(storage.getData().contains(EXAMPLE_DATA));
    }

    @Test
    void shouldNotRemoveNonExistingData() {
        // given
        storage.addValue(EXAMPLE_DATA);

        // when
        boolean actualResult = storage.removeValue("non-existing-value");

        // then
        assertFalse(actualResult);
        assertEquals(1, storage.getData().size());
    }
}