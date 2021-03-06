package org.fossasia.susi.ai.rest.responses.susi

import java.util.ArrayList
import io.realm.RealmList

/**
 * <h1>Kotlin Data class to parse answer in retrofit response from susi client.</h1>
 */

class Answer (

        val data: RealmList<Datum> = RealmList<Datum>(),

        val metadata: Metadata? = null,

        val actions: List<Action> = ArrayList()
)
