-- Database: "TrabalhodeBD"

-- DROP DATABASE "TrabalhodeBD";

CREATE DATABASE "TrabalhodeBD"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;
       
create table CLIENTE (
	Codigo_do_Cliente int[5],
	Nome_do_Cliente CHAR(20),
	Endereco CHAR(30),
	Cidade CHAR(15),
	CEP CHAR(8),
	UF CHAR(2),
	CGC int[20],
	Inscr_Estadual CHAR(20),
	CONSTRAINT CLIENTE_PK
		PRIMARY KEY(Codigo_do_Cliente)
	);
create table VENDEDOR(
	Codigo_do_Vendedor int[3],
	Nome_do_Vendedor CHAR(20),
	Salario_Fixo float[7],
	Faixa_de_Comissao CHAR(1),
	CONSTRAINT VENDEDOR_PK
		PRIMARY KEY(Codigo_do_Vendedor)
);
create table PEDIDO(
	Numero_do_pedido int[5],
	Prazo_de_entrega int[3],
	Codigo_do_Cliente int[5]NOT NULL,
	Codigo_do_Vendedor int[3]NOT NULL,
	CONSTRAINT PEDIDO_PK
		PRIMARY KEY(Numero_do_Pedido),
	CONSTRAINT PEDIDO_FK
		FOREIGN KEY(Codigo_do_Cliente)
		REFERENCES CLIENTE(Codigo_do_Cliente)
		ON DELETE CASCADE,
		FOREIGN KEY(Codigo_do_Vendedor)
		REFERENCES VENDEDOR(Codigo_do_Vendedor)
		ON DELETE CASCADE
);
create table PRODUTO(
	Codigo_do_Produto int[7],
	Unidade CHAR(3),
	Descricao CHAR(30),
	Valor_Unitario float[9],
	CONSTRAINT  PRODUTO_PK
		PRIMARY KEY(Codigo_do_Produto)
);
create table ITEM_PEDIDO(
	Numero_do_pedido int[5]NOT NULL,
	Codigo_do_Produto int[7]NOT NULL,
	Quantidade float[9]	
);

ALTER TABLE ITEM_PEDIDO ADD FOREIGN KEY (Numero_do_pedido) REFERENCES PEDIDO(Numero_do_pedido);

ALTER TABLE ITEM_PEDIDO ADD FOREIGN KEY (Codigo_do_Produto) REFERENCES PRODUTO(Codigo_do_Produto);

SELECT Unidade, Descricao, Valor_Unitario FROM PRODUTO;

SELECT 	Nome_do_Cliente, Endereco, CGC FROM CLIENTE;

SELECT * FROM VENDEDOR;

SELECT * FROM ITEM_PEDIDO WHERE Quantidade = 32;

SELECT * FROM CLIENTE WHERE UF = 'RJ';

SELECT * FROM PRODUTO WHERE Unidade = 'UN' AND Valor_Unitario < 30.00;

SELECT * FROM CLIENTE WHERE UF = 'RJ';

SELECT * FROM CLIENTE WHERE Codigo_do_Cliente <> 5;

SELECT Codigo_do_Produto, Descricao FROM PRODUTO WHERE Valor_unitario BETWEEN 5.00 AND 12.00;

SELECT * FROM PRODUTO WHERE Unidade LIKE 'K';

SELECT * FROM VENDEDOR WHERE Nome_do_Vendedor NOT LIKE 'V';

SELECT * FROM VENDEDOR WHERE Faixa_de_Comissao = '5%' OR Faixa_de_Comissao = '15%';

SELECT Nome_do_Vendedor, Salario_Fixo FROM VENDEDOR ORDER BY Nome_do_Vendedor ASC;

SELECT Nome_do_Cliente, Cidade, UF FROM CLIENTE ORDER BY UF AND Cidade DESC;

SELECT Descricao, Valor_Unitario FROM PRODUTO WHERE Unidade = 'M' ORDER BY Valor_Unitario ASC;

SELECT ((Salario_Fixo * 0.75)+ 120) FROM VENDEDOR WHERE Faixa_de_Comissao = '5';

SELECT MAX(Salario_Fixo), MIN(Salario_Fixo) FROM VENDEDOR;

SELECT Quantidade FROM ITEM_PEDIDO WHERE Codigo_do_Produto = 78;

SELECT AVG(Salario_Fixo) FROM VENDEDOR;

SELECT COUNT(Salario_Fixo) FROM VENDEDOR WHERE Salario_Fixo > 2500;

SELECT DISTINCT Unidade FROM PRODUTO;SELECT Numero_do_Pedido, Quantidade FROM ITEM_PEDIDO;SELECT Numero_do_Pedido FROM ITEM_PEDIDO WHERE Quantidade > 3;SELECT C.Nome_do_Cliente, C.Codigo_do_Cliente, P.Numero_do_Pedido FROM CLIENTE C, PEDIDO P WHERE C.Codigo_do_Cliente = P.Codigo_do_Cliente;SELECT C.Nome_do_Cliente FROM CLIENTE C, PEDIDO P WHERE P.Prazo_de_Entrega > 15 AND (C.UF = 'SP' or C.UF = 'RJ');SELECT C.Nome_do_Cliente, P.Prazo_de_Entrega FROM CLIENTE C, PEDIDO P ORDER BY P.Prazo_de_Entrega desc;SELECT V.Nome_do_Vendedor FROM VENDEDOR V, PEDIDO P WHERE P.Prazo_de_Entrega > 15 AND  V.Salario_Fixo >=1000 ORDER BY V.Nome_do_Vendedor;SELECT C.Nome_do_Cliente FROM CLIENTE C, PEDIDO P, PRODUTO A WHERE P.Prazo_de_Entrega > 15 AND A.Descricao = 'Queijo%' AND C.Cidade = 'RIO DE JANEIRO';SELECT V.Nome_do_Vendedor FROM VENDEDOR V, ITEM_PEDIDO I, PRODUTO A WHERE A.Descricao = 'Chocolate' AND I.Quantidade > 10;SELECT DISTINCT COUNT(C.Codigo_do_Cliente) FROM CLIENTE C, PEDIDO P, VENDEDOR V WHERE V.Nome_do_Vendedor = 'JOÃO' AND C.Codigo_do_Cliente = P.Codigo_do_Cliente AND V.Codigo_do_Vendedor = P.Codigo_do_Vendedor;SELECT DISTINCT C.Cidade, COUNT(C.Codigo_do_Cliente) FROM CLIENTE C, PEDIDO P, VENDEDOR V WHERE (C.Cidade = 'Rio de Janeiro' or C.Cidade = 'Niterói') AND P.Codigo_do_Vendedor = V.Codigo_do_Vendedor AND V.Nome_do_Vendedor = 'JOÃO' GROUP BY C.Cidade;SELECT DISTINCT P.Numero_do_produto FROM Produto P, ITEM_PEDIDO IP WHERE P.Numero_do_produto = IP.Numero_do_produto AND IP.Quantidade = 10;SELECT Nome_do_Vendedor FROM VENDEDOR  WHERE Salario_Fixo < (SELECT AVG(Salario_Fixo) FROM VENDEDOR);
