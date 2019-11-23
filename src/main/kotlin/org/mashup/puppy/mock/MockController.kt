package org.mashup.puppy.mock

import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MockController() {

    @ApiOperation(value = "MAIN", notes = "일기(제목/날짜) & 별자리 운세(아이템 추) API")
    @ApiResponses(value = [ApiResponse(code = 200, message = "MAIN API 성공"),
        ApiResponse(code = 500, message = "서버 에러")])
    @GetMapping("/v1/main")
    fun getMain(): ResponseEntity<ResMainDto> =
            ResponseEntity.status(HttpStatus.OK)
                    .body(ResMainDto(
                            ResSimpleDiary("2019년 11월 23일", "오늘 하루는 어땟나요?", 1),
                            ResHoroscopeFortuneItem("거울", 7, "사랑", "달리기", 1)))

    @ApiOperation(value = "HoroscopeFortune", notes = "별자리 운세 보기 API")
    @ApiResponses(value = [ApiResponse(code = 200, message = "별자리 운세 보기 성공"),
        ApiResponse(code = 500, message = "서버 에러")])
    @GetMapping("/v1/horoscope-fortunes/{horoscopeFortuneId}")
    fun getHoroscopeFortune(@PathVariable horoscopeFortuneId: Long): ResponseEntity<ResHoroscopeFortuneDto> =
            ResponseEntity.status(HttpStatus.OK)
                    .body(ResHoroscopeFortuneDto(
                            ResHoroscopeFortuneItem("거울", 7, "사랑", "달리기", 1),
                            "활기찬 한 주가 되겠네요. 한 주를 시작하는 월요일부터 기운이 넘치는 주간입니다. 유난히 친구를 많이 만나게 됩니다. 즐거운 시간이 많겠지만 건강관리는 좀 하셔야 합니다. 특정한 목적을 가진 만남은 좋지 않습니다. 취미나 동호회활동은 약간 기대에 모자란 정도입니다. "))


}