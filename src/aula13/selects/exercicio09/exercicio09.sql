CREATE TABLE funcionarios (
	id_funcionario SERIAL PRIMARY KEY,
	nome_funcionario dm_descricao,
	cargo VARCHAR(30),
	data_contratacao DATE
);


INSERT INTO funcionarios (nome_funcionario, cargo, data_contratacao) VALUES
('Teste','Testador','2023-02-22'),
('Testinho','Tester','2023-12-22'),
('Testao','Testado','2011-12-12');
