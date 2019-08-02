-- Table: public.department

-- DROP TABLE public.department;

CREATE TABLE public.department
(
  Id serial,
  Name name,
  CONSTRAINT Id PRIMARY KEY (Id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.department
  OWNER TO demodao;

-- Table: public.seller

-- DROP TABLE public.seller;

CREATE TABLE public.seller
(
  Id serial,
  Name name NOT NULL,
  Email text NOT NULL,
  BirthDate date NOT NULL,
  BaseSalary double precision NOT NULL,
  DepartmentId integer NOT NULL,
  CONSTRAINT seller_pkey PRIMARY KEY (Id),
  CONSTRAINT seller_departmentid_fkey FOREIGN KEY (DepartmentId)
      REFERENCES public.department (Id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.seller
  OWNER TO demodao;