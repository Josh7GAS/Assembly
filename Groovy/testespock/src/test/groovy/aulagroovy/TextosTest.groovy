package aulagroovy

import producao.CalculadoraSalario
import spock.lang.Specification

class TextosTest extends Specification {

    def 'deve Ter Strings Iguais'() {
        given:
        def texto1 = 'boa tarde, mano'


        when:
        def texto2 = 'boa tarde, mano'//'boa tarde, mano

        then:
        texto1 == texto2
    }

    def 'deve pagar 5% de INSS'() {
        given:
        def calculadora = new CalculadoraSalario()
        def bruto = 800

        when:
        def inss = calculadora.getDescontoInss(bruto)

        then:
        inss == 40.0
    }

    def 'deve Pegar o Cara Certo da Lista'() {
        given:
        def lista = null //['abel', null, 'mike']

        when:
        def cara = 1

        then:
        lista[cara].toUpperCase() == 'JORGE'
    }

    //data driven tests
    def 'deve calcular o líquido corretamente'(){
        expect:
        liquido == new CalculadoraSalario().getSalarioLiquido(bruto)

        where:
        bruto | liquido
        900   | 855
        1010  | 808
        3500  | 2450
    }
}
