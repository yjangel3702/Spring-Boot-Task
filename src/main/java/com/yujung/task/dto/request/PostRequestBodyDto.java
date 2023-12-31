package com.yujung.task.dto.request;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NotNull
@NotBlank
public class PostRequestBodyDto {
  
  private String taskName;
  private String category;
  private String contents;
  private String date;
  private String time;
  
}
