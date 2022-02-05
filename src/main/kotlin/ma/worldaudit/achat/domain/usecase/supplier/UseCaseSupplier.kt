package ma.worldaudit.achat.domain.usecase.supplier

import ma.worldaudit.achat.domain.model.SupplierDomain
import ma.worldaudit.achat.domain.model.ContactDomain
import ma.worldaudit.achat.domain.port.api.ISupplierServicesPort
import ma.worldaudit.achat.domain.port.infra.ISupplierRepositoryPort

class UseCaseSupplier(
    private val fournisseurRepository: ISupplierRepositoryPort
) : ISupplierServicesPort {
    override fun addSupplier(supplierDomain: SupplierDomain) {
        fournisseurRepository.addSupplier(supplierDomain)
    }

    override fun updateSupplier(id: Long, supplierDomainNew: SupplierDomain) {
        fournisseurRepository.updateSupplier(id, supplierDomainNew)
    }

    override fun deleteSupplier(id: Long) {
        //A revoir: if(fournisseur is deleted) ==> facture.fournisseur?? :D
        fournisseurRepository.deleteSupplier(id)
    }

    override fun getSupplier(id: Long): SupplierDomain {
        return fournisseurRepository.getSupplier(id)
    }

    override fun getSupplierByEmail(email: String): SupplierDomain {
        return fournisseurRepository.getSupplierByEmail(email)
    }

    override fun getSupplierContacts(idFournisseur: Long): List<ContactDomain> {
        return fournisseurRepository.getSupplierContact(idFournisseur)
    }

    override fun getContactPhoneNumbers(idFournisseur: Long): List<String> {
        return fournisseurRepository.getContactPhoneNumbers(idFournisseur)
    }

    override fun getContactEmails(idFournisseur: Long): List<String> {
        return fournisseurRepository.getContactEmails(idFournisseur)
    }

    override fun addContactToSupplier(contactDomain: ContactDomain) {
        fournisseurRepository.addContactToSupplier(contactDomain)
    }

    override fun deleteContact(idPersonneDomain: Long) {
        fournisseurRepository.deleteContact(idPersonneDomain)
    }

    override fun updateContact(contactId: Long, contactDomain: ContactDomain ) {
        fournisseurRepository.updateContact(contactId, contactDomain)
    }

    override fun getAllSuppliers(page: Int, size: Int): List<SupplierDomain> {
        return fournisseurRepository.getAllSuppliers(page, size)
    }

    override fun getAllContacts(): List<ContactDomain> {
        return fournisseurRepository.getAllContacts()
    }

}
