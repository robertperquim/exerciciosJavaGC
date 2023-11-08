CREATE DOMAIN dm_descricao VARCHAR(50);

CREATE TABLE clientes (
	ID_Cliente SERIAL PRIMARY KEY,
	Nome dm_descricao,
	Email dm_descricao,
	Telefone CHAR(11)
);

CREATE TABLE Produtos (
	ID_Produto SERIAL PRIMARY KEY,
	nome_produto dm_descricao,
	preco REAL,
	categoria VARCHAR(20)
);

CREATE TABLE Pedidos (
	ID_Pedido SERIAL PRIMARY KEY,
	data_pedido DATE,
	valor_total REAL,
	cliente_ID INTEGER REFERENCES clientes(ID_Cliente)
);

CREATE TABLE DetalhesDoPedido (
	ID_Detalhe SERIAL PRIMARY KEY,
	quantidade INTEGER NOT NULL,
	produto_ID INTEGER REFERENCES Produtos(ID_Produto),
	pedido_ID INTEGER REFERENCES Pedidos(ID_Pedido)

);