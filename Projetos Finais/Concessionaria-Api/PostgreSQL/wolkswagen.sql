--
-- Estrutura da tabela "volkswagen"
--

CREATE TABLE public.volkswagen  (
   id bigint NOT NULL,
   modelo  character varying(120) NOT NULL,
   cor character varying(20) NOT NULL,
   cilindradas float NOT NULL,
   ano  int NOT NULL,
   preço  float NOT NULL,
   quantPortas  int NOT NULL,
   /* Keys */
  CONSTRAINT volkswagen_pkey
    PRIMARY KEY (id)
);

--
-- Inserindo dados na tabela "volkswagen"
--

INSERT INTO "volkswagen" (id, modelo, cor, cilindradas, ano, preço, quantPortas) VALUES							
(1,	'Amarok','Vermelho', 3.0, 2021, 243290, 4),
(2,	'Virtus',	'Preto', 1.6, 2022, 68490, 4),
(3,	'Jetta',	'Branco', 2.0, 2021, 178490, 4),
(4,	'Saveiro',	'Prata', 1.6, 2020, 58990, 2),