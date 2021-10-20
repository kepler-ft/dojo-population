/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package populacao.dojo

fun crescimentoPopulacional(populacaoInicial : Int, porcentagemDeCrescimento : Double, novosImigrantes : Int, populacaoMeta : Int): Int
{
    var i = 0
    var populacaoNova: Double = populacaoInicial.toDouble()
    while (populacaoNova < populacaoMeta) {
        populacaoNova += (populacaoNova * porcentagemDeCrescimento / 100) + novosImigrantes
        i++
    }
    return i
}
