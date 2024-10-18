package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;
//dto
public record DadosCadastroMedico(

        //bean validation
        @NotBlank //verifica se o campo está em branco | só pra Strings
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //ele é um numero de 4 a 6 digitos
        String crm,

        @NotNull //Nao é nulo
        Especialidade especialidade,

        //validar objeto
        @NotNull @Valid DadosEndereco endereco) {

}
