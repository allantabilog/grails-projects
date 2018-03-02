package au.com.redenergy.mirner

class PagingResult {
    static final Integer DEFAULT_LIMIT = 10
    static final Integer DEFAULT_OFFSET = 0

    Long totalCount = MockMirnData.ALL_MIRNS.size()
    Integer limit = DEFAULT_LIMIT
    Integer offset = 0
    Integer lastPage = 0
    String lastRecordKey = ''
}
