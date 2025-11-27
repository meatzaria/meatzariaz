/*
CREATE TABLE vendas3 (
ID_vendas integer PRIMARY KEY AUTOINCREMENT,
Curso VARCHAR(100),
Aluno Varchar (100),
Estacio varchar (100),
Valor decimal(10.2)
);*/
/*
INSERT INTO vendas3(Curso, Aluno, Estacio, Valor) VALUES
('Excel', 'João', 'SP', 100),
('VBA', 'Lucas', 'RJ', 50),
('Excel', 'Alice', 'SP', 100),
('Excel', 'Pedro', 'PE', 100),
('VBA', 'Amanda', 'SP', 50),
('Power BI', 'Rita', 'RS', 80),
('Excel', 'Julia', 'RJ', 100),
('Power BI', 'Caio', 'SP', 80),
('Power BI', 'Lara', 'MG', 80),
('Excel', 'Rogério', 'AC', 80),
('SQL', 'MeuNome', 'SP', 500);
*/
/*

INSERT INTO vendas3(Curso, Aluno, Estacio, Valor) VALUES
('IOT','renato','RS',700)
*/
/*
UPDATE vendas3 SET valor=150 where curso='VBA' "AUMENTAR VALOR DE CURSO"
*/
/*
DELETE FROM vendas3 Where id_vendas =10 "DELETAR ID DE ALGUEM"
*/
/*
SELECT count (curso) FROM vendas3 where curso= 'Excel' "NUMERO DE PESSOAS NO CURSO"
*/
/*
SELECT sum (valor) FROM vendas3 where curso= 'Excel' "SOMA DE VALORES"
*/
/*
SELECT avg (valor) from vendas3 "MEDIA DE VALOR"
*/
