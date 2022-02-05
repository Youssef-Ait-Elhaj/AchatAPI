package ma.worldaudit.achat.api.model

import ma.worldaudit.achat.domain.model.TypologyDomain

enum class TypologyApi(val value: Int) {
    MATERIELS_INFORMATIQUES(235),
    ACHAT(613),
    TVA(3455),
    FOURNISSEUR(4411)
}

fun TypologyApi.toDomain(): TypologyDomain {
    val typologyDomain: TypologyDomain
    when (this) {
        TypologyApi.ACHAT -> typologyDomain = TypologyDomain.ACHAT
        TypologyApi.FOURNISSEUR -> typologyDomain = TypologyDomain.FOURNISSEUR
        TypologyApi.TVA -> typologyDomain = TypologyDomain.TVA
        TypologyApi.MATERIELS_INFORMATIQUES -> typologyDomain = TypologyDomain.MATERIELS_INFORMATIQUES
    }

    return typologyDomain
}
