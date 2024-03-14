--
-- Estrutura da tabela "fiat"
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

DROP TABLE IF EXISTS "fiat" CASCADE;

--
-- Estrutura da tabela "fiat"
--

CREATE TABLE public.fiat (
   id bigint NOT NULL,
   modelo  character varying(120) NOT NULL,
   cor character varying(20) NOT NULL,
   cilindradas float NOT NULL,
   ano  int NOT NULL,
   preço  float NOT NULL,
   quantPortas  int NOT NULL,
);


COMMENT ON COLUMN public.fiat.cod_tom
  IS 'Código TOM (SEFAZ)';
  

ALTER TABLE public.fiat OWNER TO postgres;

--
-- Name: fiat_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.fiat_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.fiat_id_seq OWNER TO postgres;

--
-- Name: fiat_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.fiat_id_seq OWNED BY public.fiat.id;


--
-- Name: fiat id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fiat ALTER COLUMN id SET DEFAULT nextval('public.fiat_id_seq'::regclass);


--
-- Inserindo dados na tabela "fiat"
--

INSERT INTO "fiat" (id, modelo, cor, cilindradas, ano, preço, quantPortas) VALUES							
(1,	'Argo','Vermelho', 2.0, 2020, 66890, 4),
(2,	'Cronos',	'Preto', 2.5, 2021, 75990, 4),
(3,	'Gran Siena',	'Branco', 1.8, 2018, 55314, 4),
(4,	'Toro',	'Azul', 3.0, 2020, 120990, 4),

======================================================
--
-- Name: fiat_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.fiat_id_seq', 1, false);


--
-- Name: cidade fiat_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.fiat
    ADD CONSTRAINT fiat_pkey PRIMARY KEY (id);