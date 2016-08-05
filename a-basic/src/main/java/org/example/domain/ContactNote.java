package org.example.domain;

import org.example.domain.finder.ContactNoteFinder;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class ContactNote extends BaseModel {

  public static final ContactNoteFinder find = new ContactNoteFinder();

  @ManyToOne(optional = false)
  Contact contact;

  String title;

  @Lob
  String note;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

}
