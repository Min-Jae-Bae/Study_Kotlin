fun main(): Unit {
    val liverpool = Liverpool(70)

    with(liverpool) {
        println("Team Name: ${liverpool.teamName}")
        println("Ranking: ${liverpool.ranking}")
        println("Victory Points: ${liverpool.victoryPoints}")
        println(haveLowRank())
    }
}
/*
* PremierLeague 추상화 클래스를 만들고 다른 팀의 승점 점수를 받는 매개변수를 만든다
* 그리고 정해지지 않은 팀 이름, 순위, 승점을 받는다
* 다른 팀의 승점과 현재 팀의 승점을 비교하는 함수를 만든다.. */

abstract class PremierLeague(private var otherTeamVictoryPoints: Int) {
    abstract val teamName: String
    abstract val ranking: Int
    abstract val victoryPoints: Int

    /*
    * 다른 팀의 승점이 현재 팀의 승점을 비교하는 함수 */
    fun haveLowRank(): Boolean {
        return otherTeamVictoryPoints < victoryPoints

    }
}

/*
* PremierLeague (매개변수) 슈퍼클래스를 상속받는 다른팀 승점 매개변수를 받는 Team 클래스를 만들고
* 각각 변수를 재정의 한다*/
class Liverpool(otherTeamVictoryPoints: Int) : PremierLeague(otherTeamVictoryPoints) {
    override val teamName = "Liverpool"
    override val ranking = 2
    override val victoryPoints = 79
}

class ManchesterCity(otherTeamVictoryPoints: Int) : PremierLeague(otherTeamVictoryPoints) {
    override val teamName: String
        get() = TODO("Not yet implemented")
    override val ranking: Int
        get() =
    override val victoryPoints =
}