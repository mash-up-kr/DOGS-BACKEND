package org.mashup.puppy.mock

data class ResMainDto(val simpleDiary: ResSimpleDiary,
                      val horoscopeFortune: ResHoroscopeFortune)

data class ResSimpleDiary(val date: String, val tile: String, val dairyId: Long)

data class ResHoroscopeFortune(val horoscopeFortuneItem: ResHoroscopeFortuneItem,
                               val horoscopeFortuneId: Long)

data class ResHoroscopeFortuneItem(
        val cody: ResRecommendationItem,
        val number: ResRecommendationItem,
        val word: ResRecommendationItem,
        val exercise: ResRecommendationItem)

data class ResRecommendationItem(val content: String,
                                 val imgUrl: String)

data class ResHoroscopeFortuneDto(val horoscopeFortuneItem: ResHoroscopeFortuneItem,
                                  val content: String,
                                  val horoscopeFortuneId: Long)