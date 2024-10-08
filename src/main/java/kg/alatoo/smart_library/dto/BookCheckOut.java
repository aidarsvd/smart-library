package kg.alatoo.smart_library.dto;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookCheckOut {

    Long readerId;

    Long bookId;

    Integer periodDays;

}
