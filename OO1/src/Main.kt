
// Questão 1
class Produto(var nome: String, var preco: Double) {
    constructor(nome: String) : this(nome, 0.0)
}

fun main1() {
    val produto1 = Produto("Produto 1", 5.0)
    val produtoSemPreco = Produto("Produto 2")
    println("Produto 1: ${produto1.nome}, ${produto1.preco}")
    println("Produto 2: ${produtoSemPreco.nome}, ${produtoSemPreco.preco}")
    // Crie instâncias das diferentes classes Produto utilizando os seus construtores e imprima os detalhes de cada produto.
}


// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 0

    fun mostrarIdade(){
        println("Idade: $idade")
    }
    // Utilize os modificadores de visibilidade para definir os atributos nome e idade conforme especificado na questão
    // Crie um método público na classe Cliente chamado mostrarIdade() conforme especificado na questão
}

fun main2() {
    val cliente = Cliente().apply {
        mostrarIdade()
    }
    // Crie uma instância de Cliente e chame o método mostrarIdade() para verificar seu funcionamento.
}

// Questão 3
abstract class Personagem {
    abstract fun atacar()
    // Crie um método abstrato atacar() conforme especificado na questão
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("Guerreiro aracando")
        // Implemente o método atacar() de acordo com as características do Guerreiro
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("Mago atavando!")
        // Implemente o método atacar() de acordo com as características do Mago
    }
}

fun main3() {
    val guerreiro = Guerreiro()
    val mago = Mago()

    guerreiro.atacar()
    mago.atacar()
    // Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.
}

// Questão 4
interface FormaGeometrica {
    fun calcularArea(): Double
    // Declare um método abstrato calcularArea() conforme especificado na questão
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double = altura * largura
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double = Math.PI * raio * raio
    // Implemente o método calcularArea() para o Circulo conforme especificado na questão
}

fun main4() {
    val retangulo = Retangulo(5.0, 3.0)
    val circulo = Circulo(2.0)

    println("Area Retangulo: ${retangulo.calcularArea()}")
    println("Area Circulo: ${circulo.calcularArea()}")
    // Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.
}

// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
    private var saldo: Double = 0.0
        set(value){
            field = if (value < 0) 0.0 else value
        }

    fun getSaldo(): Double {
        return saldo
    }

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double): Boolean {
        if (valor > saldo) return false
        saldo -= valor
        return true
    }
    // Implemente um getter personalizado para a propriedade nomeTitular conforme especificado na questão
    // Implemente override do setter para o atributo saldo conforme especificado na questão
}

fun main() {
    val conta = ContaBancaria().apply {
        nomeTitular = "Vamberto"
        //saldo = 800.0
        println("Titular: $nomeTitular, Saldo: ")
    }
    conta.sacar(500.0)
    println("Titular: $conta.nomeTitular, Saldo: ${conta.getSaldo()}")

    conta.depositar(1000.0)
    println("Titular: $conta.nomeTitular, Saldo: ${conta.getSaldo()}")
    // Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
}
