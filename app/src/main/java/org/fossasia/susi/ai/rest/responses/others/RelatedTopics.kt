package org.fossasia.susi.ai.rest.responses.others

/**
 * <h1>Kotlin Data class to parse related topics object in retrofit response from websearch client.</h1>
 *
 * Created by mayank on 09-12-2016.
 */

class RelatedTopics (

    var FirstURL: String? = null,

    var Text: String? = null,

    var icon: WebIcon? = null,

    var Result: String? = null
)
