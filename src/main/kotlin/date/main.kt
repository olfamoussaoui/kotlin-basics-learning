package date

import java.time.LocalDateTime

fun main() {

    var transactions = mutableListOf<Transaction>(
        Transaction("1", "21363669", LocalDateTime.of(2021, 11, 12, 12,10,10)),
        Transaction("2", "21363669", LocalDateTime.of(2021, 10, 12, 0,10,10)),
        Transaction("3", "21363669", LocalDateTime.of(2021, 8, 12, 12,10,10)),
        Transaction("4", "21363669", LocalDateTime.of(2021, 1, 12, 12,10,10)),
        Transaction("5", "21363669", LocalDateTime.of(2021, 5, 12, 12,10,10)),
        Transaction("6", "21363669", LocalDateTime.of(2021, 11, 12, 0,0,0)),
        Transaction("7", "21363668", LocalDateTime.of(2021, 11, 12, 7,0,0))
    )

    var filtredTransactions = transactions.filter { it -> it.msisdn == "21363669" }
    println("filtredTransactions = $filtredTransactions")
    println("transactions = $transactions")

    var request = RequestBody("21363669", "8547", LocalDateTime.of(2021,10,1,12,0,0), LocalDateTime.of(2021,11,12,12,30,0))

    //Range date is ok
    var filtredTransactionsByRangeDate = filtredTransactions.filter { it -> (it.date.isAfter(request.startDate) && it.date.isBefore(request.endDate)) }
    println("filtredTransactionsByRangeDate = $filtredTransactionsByRangeDate")

    //Only StartDate
    var request2 = RequestBody("21363669", "8547", null, LocalDateTime.of(2021,11,12,12,30,0))
    if (request2.startDate == null && request2.endDate != null) {
        var filtredTransactionsByEndDate = filtredTransactions.filter { it -> it.date.isBefore(request.endDate) }
        println("filtredTransactionsByEndDate = $filtredTransactionsByEndDate")
    }
    //OnlyEndDate
    var request3 = RequestBody("21363669", "8547", LocalDateTime.of(2021,10,1,12,0,0), null)
    if (request3.startDate != null && request3.endDate == null) {
        var filtredTransactionsByStartDate = filtredTransactions.filter { it -> it.date.isAfter(request.startDate) }
        println("filtredTransactionsByStartDate = $filtredTransactionsByStartDate")
    }
}


data class Transaction(val id: String, val msisdn: String, val date: LocalDateTime)
data class RequestBody(val msisdn: String, val otp: String, val startDate: LocalDateTime?, val endDate: LocalDateTime?)