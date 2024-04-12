package com.folksdev.account.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
data class Customer(

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,

    val name: String?,
    var surname: String?,

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    val accounts: Set<Account>
) {

    constructor() : this(null, null, null, HashSet())
    //constructor(name: String, surname: String) : this(null, name, surname, null)
}