package kr.co.bonjin.livepreview.response

class ApiDataResponse<E>(  // 공통되지 않는 데이터
    var data: E
) : ApiResponse()