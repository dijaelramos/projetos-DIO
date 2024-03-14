--
-- Estrutura da tabela "ford"
--

CREATE TABLE public.ford (
   id bigint NOT NULL,
   modelo  character varying(120) NOT NULL,
   cor character varying(20) NOT NULL,
   cilindradas float NOT NULL,
   ano  int NOT NULL,
   preço  float NOT NULL,
   quantPortas  int NOT NULL,
   /* Keys */
  CONSTRAINT ford_pkey
    PRIMARY KEY (id)
);

--
-- Inserindo dados na tabela "ford"
--

INSERT INTO "ford" (id, modelo, cor, cilindradas, ano, preço, quantPortas) VALUES							
(1,	'EcoSport','Vermelho', 1.5, 2020, 79990, 4),
(2,	'Ranger Cabine Simples Estendida',	'Preto', 2.2, 2022, 163490, 2),
(3,	'Fusion',	'Branco', 2.0, 2019, 149900, 4),
(4,	'Mustang',	'Prata', 5.0, 2021, 499000, 2),