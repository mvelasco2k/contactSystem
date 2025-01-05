package gm.contacts.service;

import gm.contacts.model.Contact;
import gm.contacts.repository.IContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService implements IContactService {

    @Autowired //Injection
    public IContactRepository contactRepository;

    @Override
    public List<Contact> listContacts() {
        return List.of();
    }

    @Override
    public Contact findContactById(Integer idContact) {
        return null;
    }

    @Override
    public void saveContact(Contact contact) {

    }

    @Override
    public void deleteContact(Contact contact) {

    }
}
