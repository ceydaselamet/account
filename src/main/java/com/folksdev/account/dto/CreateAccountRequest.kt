package com.folksdev.account.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import java.math.BigDecimal

class CreateAccountRequest(
    @field:NotBlank(message = "Id boş geçilemez.")
    val customerId: String,

    @field:Min(value=0, message = "0'dan küçük değer girilemez.")
    val initialCredit: BigDecimal
)
