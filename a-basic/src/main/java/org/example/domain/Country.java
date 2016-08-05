package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.avaje.ebean.annotation.CacheStrategy;
import com.avaje.ebean.annotation.CacheTuning;
import org.example.domain.finder.CountryFinder;

/**
 * Country entity bean.
 */
@CacheStrategy(readOnly = true)//, warmingQuery = "order by name")
@CacheTuning(maxSize = 500)
@Entity
@Table(name = "o_country")
public class Country {

  /**
   * Convenience Finder for 'active record' style.
   */
  public static final CountryFinder find = new CountryFinder();

  @Id
  @Size(max = 2)
  String code;

  @Size(max = 60)
  String name;

  public String toString() {
    return code;
  }

  /**
   * Return code.
   */
  public String getCode() {
    return code;
  }

  /**
   * Set code.
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Return name.
   */
  public String getName() {
    return name;
  }

  /**
   * Set name.
   */
  public void setName(String name) {
    this.name = name;
  }


}
