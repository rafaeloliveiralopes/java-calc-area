/**
 * Classe utilitária para cálculo de área de figuras geométricas.
 *
 * @since 1.0
 * @version 1.1
 * @author Rafael Lopes
 */

public class CalculaArea {

    /**
     * Calcula a área de um retângulo.
     *
     * @param largura Largura do retângulo.
     * @param altura  Altura do retângulo.
     * @return Área calculada.
     * @throws IllegalArgumentException se largura ou altura forem negativos.
     * @see java.lang.Math
     */
    public double calcularArea(double largura, double altura) {
        if (largura < 0 || altura < 0)
            throw new IllegalArgumentException("A largura e altura devem ser positivos.");
        return largura * altura;
    }
}
