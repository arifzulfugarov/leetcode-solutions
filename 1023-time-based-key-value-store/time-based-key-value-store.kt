class TimeMap() {

    private val map = HashMap<String, MutableList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        
        if(!map.containsKey(key)){
            map[key] = ArrayList()
        }

        map[key]!!.add(Pair(timestamp, value))

    }

    fun get(key: String, timestamp: Int): String {
        
       if(!map.containsKey(key)){
            return ""
       }

       val list = map[key]!!
       var result = ""
       var left = 0
       var right = list.size-1

       while (left<=right){

            val mid = left + (right-left)/2

            if (list[mid].first <= timestamp){
                result = list[mid].second
                left = mid + 1
            } else {
                right = mid - 1
            }
       }

        return result


    }

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * var obj = TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */