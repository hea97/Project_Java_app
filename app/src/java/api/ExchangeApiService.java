public interface ExchangeApiService {
    @GET("exchange/rate/USD")
    Call<ExchangeRate> getExchangeRate(
            @Header("apikey") String apiKey
    );
}