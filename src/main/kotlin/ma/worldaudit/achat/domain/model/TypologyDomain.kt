package ma.worldaudit.achat.domain.model

import ma.worldaudit.achat.api.model.TypologyApi
import ma.worldaudit.achat.infra.model.Typology

enum class TypologyDomain(val value: Int) {
    MATERIELS_INFORMATIQUES(235),
    ACHAT(613),
    TVA(3455),
    FOURNISSEUR(4411)
}

fun TypologyDomain.toInfra(): Typology {
    val typology: Typology
    when (this) {
        TypologyDomain.ACHAT -> typology = Typology.ACHAT
        TypologyDomain.FOURNISSEUR -> typology = Typology.FOURNISSEUR
        TypologyDomain.TVA -> typology = Typology.TVA
        TypologyDomain.MATERIELS_INFORMATIQUES -> typology = Typology.MATERIELS_INFORMATIQUES
    }

    return typology
}

fun TypologyDomain.toApi(): TypologyApi {
    val typologyApi: TypologyApi
    when (this) {
        TypologyDomain.ACHAT -> typologyApi = TypologyApi.ACHAT
        TypologyDomain.FOURNISSEUR -> typologyApi = TypologyApi.FOURNISSEUR
        TypologyDomain.TVA -> typologyApi = TypologyApi.TVA
        TypologyDomain.MATERIELS_INFORMATIQUES -> typologyApi = TypologyApi.MATERIELS_INFORMATIQUES
    }

    return typologyApi
}
