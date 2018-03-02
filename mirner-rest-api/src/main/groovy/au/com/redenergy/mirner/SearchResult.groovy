package au.com.redenergy.mirner

import groovy.transform.Canonical
import groovy.transform.ToString

@Canonical
@ToString(includePackage = false, includeNames = true)
class SearchResult {
    PagingResult pagingResult
    Collection<MirnResult> mirns = []
}
