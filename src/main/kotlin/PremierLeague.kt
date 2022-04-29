fun main(): Unit {
    val liverpool = Liverpool(70, "You get 3 points!")
    val manchesterCity = ManchesterCity(90,"You get 3 points!")
    val manchesterUnited = ManchesterUnited(50, "You get 3 points!")

    with(liverpool) {
        println("Team Name: ${liverpool.teamName}")
        println("Ranking: ${liverpool.ranking}")
        println("Victory Points: ${liverpool.victoryPoints}")
        println("Congratulation: ${victory()}")
        println("Have a low rank? ${haveLowRank()}")
    }

    with(manchesterCity) {
        println("Team Name: ${manchesterCity.teamName}")
        println("Ranking: ${manchesterCity.ranking}")
        println("Victory Points: ${manchesterCity.victoryPoints}")
        println("Congratulation: ${victory()}")
        println("Have a low rank? ${haveLowRank()}")
    }

    with(manchesterUnited) {
        println("Team Name: ${manchesterUnited.teamName}")
        println("Ranking: ${manchesterUnited.ranking}")
        println("Victory Points: ${manchesterUnited.victoryPoints}")
        println("Congratulation: ${victory()}")
        println("Have a low rank? ${haveLowRank()}")
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
    abstract fun victory() : String
}

/*
* PremierLeague (매개변수) 슈퍼클래스를 상속받는 다른팀 승점 매개변수를 받는 Team 클래스를 만들고
* 각각 변수를 재정의 한다*/
class Liverpool(otherTeamVictoryPoints: Int,
                val congratulation: String) : PremierLeague(otherTeamVictoryPoints) {
    override val teamName = "Liverpool"
    override val ranking = 2
    override val victoryPoints = 79
    override fun victory(): String {
        return congratulation
    }
}

open class ManchesterCity(otherTeamVictoryPoints: Int,
                          val congratulation: String) : PremierLeague(otherTeamVictoryPoints) {
    override val teamName = "ManchesterCity"
    override val ranking = 1
    override val victoryPoints = 80

    override fun victory(): String {
        return congratulation + congratulation
    }
}

class ManchesterUnited(otherTeamVictoryPoints: Int, congratulation: String) : ManchesterCity(otherTeamVictoryPoints, congratulation) {
    override val teamName = "ManchesterUnited"
    override val ranking = 6
    override val victoryPoints = 54

    override fun victory(): String {
        return super.victory()
    }
}

