package org.example.service

import com.avaje.ebean.Ebean

/**
 * Execute function in a transaction with transaction required semantics.
 * <p>
 *   Kotlin extension function as alternative to Ebean#execute()
 */
fun txn(body:() -> Unit) {

  // execute the function in a transaction
  // with Transaction Required semantics
  Ebean.execute({
    body();
  });
}