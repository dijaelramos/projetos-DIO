--
-- Estrutura da tabela "honda"
--

CREATE TABLE public.honda (
   id bigint NOT NULL,
   modelo  character varying(120) NOT NULL,
   cor character varying(20) NOT NULL,
   cilindradas float NOT NULL,
   ano  int NOT NULL,
   preço  float NOT NULL,
   quantPortas  int NOT NULL,
   /* Keys */
  CONSTRAINT honda_pkey
    PRIMARY KEY (id)
);

--
-- Inserindo dados na tabela "honda"
--

INSERT INTO "honda" (id, modelo, cor, cilindradas, ano, preço, quantPortas) VALUES							
(1,	'Honda Civic','Preto', 2.0, 2019, 119890, 4),
(2,	'Honda CR-V',	'Vermelho', 1.5, 2019, 210000, 4),
(3,	'Honda City',	'Branco', 1.5, 2018, 77680, 4),
(4,	'Honda HR-V',	'Prata', 1.8, 2021, 163890, 4),