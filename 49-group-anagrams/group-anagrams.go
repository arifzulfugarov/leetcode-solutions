func sortString(s string) string{

    runes := []rune(s)

    sort.Slice(runes, func(i, j int) bool {
        return runes[i] < runes[j]
    })

    return string(runes)
}





func groupAnagrams(strs []string) [][]string {
    
    mapAnagram := make(map[string][]string)

    for _, s := range strs{

        key := sortString(s)

        mapAnagram[key] = append(mapAnagram[key], s)


    }

    result := make([][]string, 0, len(mapAnagram))

    for _, group := range mapAnagram{

        result = append(result, group)
    }

return result
}