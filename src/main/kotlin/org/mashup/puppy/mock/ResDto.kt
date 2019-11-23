package org.mashup.puppy.mock

data class ResMainDto(val simpleDiary: ResSimpleDiary, val horoscopeFortuneItem: ResHoroscopeFortuneItem)

data class ResSimpleDiary(val date: String, val tile: String, val dairyId: Long)

data class ResHoroscopeFortuneItem(val luckyCody: String,
                                   val luckyNumber: Long,
                                   val luckyWord: String,
                                   val luckyExercise: String,
                                   val horoscopeFortuneId: Long)


data class ResHoroscopeFortuneDto(val resHoroscopeFortuneItem: ResHoroscopeFortuneItem,
                                  val content: String)