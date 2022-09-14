package com.github.hotire.springflyway

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Account(
    @Id @GeneratedValue
    var id: Long?
)
