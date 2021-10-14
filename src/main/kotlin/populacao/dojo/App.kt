/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package populacao.dojo

fun crescimentoPopulacional(populacaoInicial : Int, porcentagemDeCrescimento : Int, novosImigrantes : Int, populacaoMeta : Int): Double
{
    var i = 0.0
    var populacaoNova = populacaoInicial
    while (populacaoNova <= populacaoMeta) {
        populacaoNova += (populacaoNova * porcentagemDeCrescimento / 100) + novosImigrantes
        i++
    }
    return i
}