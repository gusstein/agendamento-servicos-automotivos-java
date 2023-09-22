package com.example.smartwashjava;

import com.example.smartwashjava.model.*;
import com.example.smartwashjava.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SmartWashJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartWashJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ServicoRepository servicoRepository, VeiculoRepository veiculoRepository,
								   UsuarioRepository usuarioRepository, FuncionarioRepository funcionarioRepository,
								   AgendamentoRepository agendamentoRepository, ClienteRepository clienteRepository) {
		return args -> {
			servicoRepository.deleteAll();
			veiculoRepository.deleteAll();
			usuarioRepository.deleteAll();
			funcionarioRepository.deleteAll();
			agendamentoRepository.deleteAll();
			clienteRepository.deleteAll();

			Servico servico1 = new Servico();
			servico1.setNome("Limpeza");
			servico1.setPreco(50L);
			servico1.setDescricao("Limpeza externa e interna do veículo");
			servico1.setDuracao("60");
			servico1.setAvaliacao(4L);
			servicoRepository.save(servico1);

			Servico servico2 = new Servico();
			servico2.setNome("Polimento");
			servico2.setPreco(100L);
			servico2.setDescricao("Polimento da pintura do veículo");
			servico2.setDuracao("40");
			servico2.setAvaliacao(5L);
			servicoRepository.save(servico2);

			Servico servico3 = new Servico();
			servico3.setNome("Aspiração");
			servico3.setPreco(80L);
			servico3.setDescricao("Aspiração interna do veículo");
			servico3.setDuracao("30");
			servico3.setAvaliacao(4L);
			servicoRepository.save(servico3);

			Servico servico4 = new Servico();
			servico4.setNome("Enceramento");
			servico4.setPreco(120L);
			servico4.setDescricao("Enceramento da pintura do veículo");
			servico4.setDuracao("45");
			servico4.setAvaliacao(4L);
			servicoRepository.save(servico4);

			Servico servico5 = new Servico();
			servico5.setNome("Higienização de estofados");
			servico5.setPreco(200L);
			servico5.setDescricao("Higienização completa dos estofados do veículo");
			servico5.setDuracao("120");
			servico5.setAvaliacao(5L);
			servicoRepository.save(servico5);

			Servico servico6 = new Servico();
			servico6.setNome("Lavagem a seco");
			servico6.setPreco(150L);
			servico6.setDescricao("Lavagem a seco do veículo");
			servico6.setDuracao("60");
			servico6.setAvaliacao(4L);
			servicoRepository.save(servico6);

			Usuario usuario = new Usuario();
			usuario.setCpf("123456789");
			usuario.setId(0L);
			usuario.setSenha("123");
			usuario.setNome("gustavo");
			usuario.setEmail("proprietario");
			usuario.setEmpresa(true);
			usuarioRepository.save(usuario);

			Usuario usuar = new Usuario();
			usuar.setCpf("123456789");
			usuar.setId(0L);
			usuar.setSenha("123");
			usuar.setNome("gustavoStein");
			usuar.setEmail("cliente");
			usuar.setEmpresa(false);
			usuarioRepository.save(usuar);

			Veiculo veiculo = new Veiculo();
			veiculo.setAno("2022");
			veiculo.setModelo("F-28");
			veiculo.setMarca("Ferrari");
			veiculo.setCarroceria("Coupé");
			veiculo.setPlaca("ABC-1234");
			veiculoRepository.save(veiculo);


//			// Criando lista de serviços e adicionando os objetos criados
//			List<Servico> servicos = new ArrayList<>();
//			servicos.add(servico1);
//			servicos.add(servico2);

			// Criando objeto Agendamento e definindo os valores
//			Agendamento agendamento = new Agendamento();
//			agendamento.setVeiculos(veiculos);
//			agendamento.setServicos(servicos);
//			agendamento.setFuncionarios(new ArrayList<>()); // Lista vazia
//			agendamento.setPreco(150L);
//			agendamento.setDataEntrada(new Date());
//			agendamento.setDataSaida(new Date());
//			agendamentoRepository.save(agendamento);
		};
	}



}
