package ma.worldaudit.achat.infra.model

import ma.worldaudit.achat.domain.model.TypologyDomain

enum class Typology(val value: Int) {
    MATERIELS_INFORMATIQUES(235),
    ACHAT(613),
    TVA(3455),
    FOURNISSEUR(4411)
}

fun Typology.toDomain(): TypologyDomain {
    val typologyDomain: TypologyDomain
    when (this) {
        Typology.ACHAT -> typologyDomain = TypologyDomain.ACHAT
        Typology.FOURNISSEUR -> typologyDomain = TypologyDomain.FOURNISSEUR
        Typology.TVA -> typologyDomain = TypologyDomain.TVA
        Typology.MATERIELS_INFORMATIQUES -> typologyDomain = TypologyDomain.MATERIELS_INFORMATIQUES
    }

    return typologyDomain
}
