package api;

import entitys.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import serialize.EmpresaRepositorio;

import java.util.List;

@SpringBootApplication
public class EmpresaApi {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    public static void main(String[] args) {
        SpringApplication.run(EmpresaApi.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            Empresa empresa = new Empresa();
            empresa.setRazaoSocial("RazaoSocial");
            empresa.setCnpj("12312312312312");

            this.empresaRepositorio.save(empresa);
            List<Empresa> empresas = empresaRepositorio.findAll();
            empresas.forEach(System.out::println);

        };
    }

}
