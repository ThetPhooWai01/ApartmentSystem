package mm.com.mytel.apartmentSystem.Repo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import mm.com.mytel.apartmentSystem.Entity.Room;

import java.time.LocalDateTime;

public class BaseResponse {
    private String errorCode;
    private Object result;
    private String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "Asia/Yangon")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime responseTime = LocalDateTime.now();

    public BaseResponse(String errorCode, Object result, String message) {
        this.errorCode = errorCode;
        this.result = result;
        this.message = message;
        this.responseTime = LocalDateTime.now();
    }


}
