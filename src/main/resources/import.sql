INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_DOCENTE');
INSERT INTO users(username, password) VALUES ('user1','$2a$12$gwParmkUIdrTqICVc4zcj.EtKnzvNLlKqNS/lc1Odb.jDov0iw.UC'); --password: 12345
INSERT INTO users(username, password) VALUES ('poli','$2a$12$gwParmkUIdrTqICVc4zcj.EtKnzvNLlKqNS/lc1Odb.jDov0iw.UC'); --password: 12345
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1); -- user1 with ROLE_USER
INSERT INTO user_roles (user_id, role_id) VALUES (2, 2); -- rraa with ROLE_DOCENTE



INSERT INTO temperatura(cezj_latitud,cezj_longitud,cezj_id,cezj_valor) VALUES('-27.45660','-7.56348',1,'25.C');
INSERT INTO temperatura(cezj_latitud,cezj_longitud,cezj_id,cezj_valor) VALUES('-78.74899','-8.23486',2,'30.C');
INSERT INTO temperatura(cezj_latitud,cezj_longitud,cezj_id,cezj_valor) VALUES('-40.77860','-10.68531',3,'20.C');
INSERT INTO temperatura(cezj_latitud,cezj_longitud,cezj_id,cezj_valor) VALUES('-89.12753','-22.78123',4,'251.C');
-- Más Colisiones (ID 1)

INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-04-12', 250.00, 1, 1, 'Mantenimiento aire acondicionado', 'Sede Central Laptops', 'Miraflores');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-05-15', 150.00, 2, 1, 'Limpieza de almacén', 'Tienda Exhibición', 'San Isidro');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-06-08', 1200.00, 3, 2, 'Reparación techo', 'Almacén Repuestos', 'Lince');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-07-10', 80.00, 4, 2, 'Control de plagas', 'Depósito Sur', 'Surquillo');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-08-09', 500.00, 5, 3, 'Instalación cámaras', 'Oficina Administrativa', 'Centro Lima');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-09-07', 100.00, 6, 4, 'Cambio de luminarias', 'Showroom Gamer', 'Miraflores');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-10-19', 220.00, 7, 1, 'Pintado de fachada', 'Almacén Tránsito', 'Callao');
INSERT INTO ecosistema (fecha_creacion, monto_mantenimiento, cezj_id, temperatura_id, cezj_descripcion, cezj_nombre, cezj_zona) VALUES ('2025-11-20', 350.00, 8, 2, 'Revisión eléctrica', 'Sede Logística', 'Ate');