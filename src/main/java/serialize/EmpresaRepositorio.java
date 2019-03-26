package serialize;

import entitys.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {

    Empresa findByCNPJ(String cnpj);

}
