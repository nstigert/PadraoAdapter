import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    void deveRetornarComportamentoAnimalNotaA() {
        Animal animal = new Animal();
        animal.setAvaliacao("A - Doguinho mais doguinho dos doguinhos");

        assertEquals("A - Doguinho mais doguinho dos doguinhos", animal.getAvaliacao());
    }

    @Test
    void deveRetornarComportamentoAnimalNotaB() {
        Animal animal = new Animal();
        animal.setAvaliacao("B - Quem é o bom menino?");

        assertEquals("B - Quem é o bom menino?", animal.getAvaliacao());
    }

    @Test
    void deveRetornarComportamentoAnimalNotaC() {
        Animal animal = new Animal();
        animal.setAvaliacao("C - Brinca, porém depende");

        assertEquals("C - Brinca, porém depende", animal.getAvaliacao());
    }

    @Test
    void deveRetornarComportamentoAnimalNotaD() {
        Animal animal = new Animal();
        animal.setAvaliacao("D - Ranzinza Master");

        assertEquals("D - Ranzinza Master", animal.getAvaliacao());
    }

    @Test
    void deveRetornarNotaAnimalA() {
        Animal animal = new Animal();
        animal.setAvaliacao("A - Doguinho mais doguinho dos doguinhos");

        assertEquals(8.0f, animal.getNota());
    }

    @Test
    void deveRetornarNotaAnimalB() {
        Animal animal = new Animal();
        animal.setAvaliacao("B - Quem é o bom menino?");

        assertEquals(6.0f, animal.getNota());
    }

    @Test
    void deveRetornarNotaAnimalC() {
        Animal animal = new Animal();
        animal.setAvaliacao("C - Brinca, porém depende");

        assertEquals(4.0f, animal.getNota());
    }

    @Test
    void deveRetornarNotaAnimalD() {
        Animal animal = new Animal();
        animal.setAvaliacao("D - Ranzinza Master");

        assertEquals(0.0f, animal.getNota());
    }
}