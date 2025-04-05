-- V2: Migrations to add column rank on tb_cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);