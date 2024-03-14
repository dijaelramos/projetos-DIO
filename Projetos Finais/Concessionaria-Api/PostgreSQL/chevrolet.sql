--
-- Estrutura da tabela "chevrolet"
--

CREATE TABLE public.chevrolet (
   id bigint NOT NULL,
   modelo  character varying(120) NOT NULL,
   cor character varying(20) NOT NULL,
   cilindradas float NOT NULL,
   ano  int NOT NULL,
   preço  float NOT NULL,
   quantPortas  int NOT NULL,
   /* Keys */
  CONSTRAINT chevrolet_pkey
    PRIMARY KEY (id)
);

--
-- Inserindo dados na tabela "chevrolet"
--

INSERT INTO "chevrolet" (id, modelo, cor, cilindradas, ano, preço, quantPortas) VALUES							
(1,	'Onix Plus','Vermelho', 2.0, 2020, 68390, 4),
(2,	'Cruze Sport6',	'Preto', 2.0, 2022, 129100, 4),
(3,	'Camaro',	'Branco', 4.6, 2022, 397360, 2),
(4,	'S10 Cabine Simples',	'Prata', 3.5, 2020, 218990, 2),