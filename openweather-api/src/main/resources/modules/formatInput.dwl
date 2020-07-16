%dw 2.0
fun retrieveObject(payload,inputString) = payload filter ($.key ~= inputString) map(object,indexOfObject) -> {
                inputString : object.value 
    }

