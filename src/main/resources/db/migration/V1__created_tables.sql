create sequence seq_bus_bit_rate_id start 1 increment 1;
create sequence seq_chip_type_id start 1 increment 1;
create sequence seq_connection_type_id start 1 increment 1;
create sequence seq_cores_number_id start 1 increment 1;
create sequence seq_corp_color_id start 1 increment 1;
create sequence seq_corp_id start 1 increment 1;
create sequence seq_corp_motherboard_form_factor_id start 1 increment 1;
create sequence seq_drive_connection_interface_id start 1 increment 1;
create sequence seq_drive_form_factor_id start 1 increment 1;
create sequence seq_drive_size_id start 1 increment 1;
create sequence seq_efficiency_id start 1 increment 1;
create sequence seq_fans_number_id start 1 increment 1;
create sequence seq_hdd_id start 1 increment 1;
create sequence seq_laptop_id start 1 increment 1;
create sequence seq_level_three_cache_id start 1 increment 1;
create sequence seq_memory_id start 1 increment 1;
create sequence seq_memory_slot_number_id start 1 increment 1;
create sequence seq_memory_type_id start 1 increment 1;
create sequence seq_motherboard_id start 1 increment 1;
create sequence seq_power_id start 1 increment 1;
create sequence seq_power_supply_id start 1 increment 1;
create sequence seq_processor_cooler_id start 1 increment 1;
create sequence seq_processor_id start 1 increment 1;
create sequence seq_pump_noise_level_id start 1 increment 1;
create sequence seq_socket_type_id start 1 increment 1;
create sequence seq_ssd_id start 1 increment 1;
create sequence seq_system_block_id start 1 increment 1;
create sequence seq_technical_process_id start 1 increment 1;
create sequence seq_threads_number_id start 1 increment 1;
create sequence seq_tpd_id start 1 increment 1;
create sequence seq_video_card_connection_interface_id start 1 increment 1;
create sequence seq_video_card_id start 1 increment 1;
create sequence seq_video_memory_amount_id start 1 increment 1;
create sequence seq_video_memory_type_id start 1 increment 1;
create sequence seq_water_block_material_id start 1 increment 1;
create sequence seq_water_cooling_system_case_material_id start 1 increment 1;
create sequence seq_water_cooling_system_id start 1 increment 1;
create table bus_bit_rates
(
    id    int8 not null,
    value int4,
    primary key (id)
);
create table chip_types
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table connection_types
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table cores_numbers
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table corp_colors
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table corp_motherboard_form_factors
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table corps
(
    id                              int8 not null,
    amount                          int4,
    height                          float8,
    name                            varchar(255),
    width                           float8,
    corp_color_id                   int8,
    corp_motherboard_form_factor_id int8,
    primary key (id)
);
create table drive_connection_interfaces
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table drive_form_factors
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table drive_sizes
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table efficiencies
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table fans_numbers
(
    id    int8 not null,
    value int4,
    primary key (id)
);
create table hdds
(
    id                            int8 not null,
    amount                        int4,
    buffer                        int4,
    name                          varchar(255),
    rotational_speed              int4,
    sequential_read_speed         int4,
    drive_connection_interface_id int8,
    drive_form_factor_id          int8,
    drive_size_id                 int8,
    primary key (id)
);
create table laptops
(
    id            int8 not null,
    amount        int4,
    name          varchar(255),
    price         float8,
    hdd_id        int8,
    processor_id  int8,
    ssd           int8,
    video_card_id int8,
    primary key (id)
);
create table laptops_memories
(
    laptop_id int8 not null,
    memory_id int8 not null
);
create table level_three_caches
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table memories
(
    id             int8 not null,
    amount         int4,
    capacity       varchar(255),
    price          float8,
    memory_type_id int8,
    primary key (id)
);
create table memory_slots_numbers
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table memory_types
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table motherboards
(
    id                              int8 not null,
    amount                          int4,
    name                            varchar(255),
    corp_motherboard_form_factor_id int8,
    memory_slots_number_id          int8,
    memory_type_id                  int8,
    socket_type_id                  int8,
    primary key (id)
);
create table power_supplies
(
    id            int8 not null,
    amount        int4,
    name          varchar(255),
    efficiency_id int8,
    power_id      int8,
    primary key (id)
);
create table powers
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table processor_coolers
(
    id                     int8 not null,
    amount                 int4,
    depth                  float8,
    diameter               float8,
    height                 float8,
    maximum_airflow        int4,
    maximum_noise_level    int4,
    maximum_rotation_speed int4,
    minimum_rotation_speed int4,
    name                   varchar(255),
    weight                 float8,
    width                  float8,
    connection_type_id     int8,
    fans_number_id         int8,
    socket_type_id         int8,
    primary key (id)
);
create table processors
(
    id                   int8 not null,
    amount               int4,
    frequency            float8,
    name                 varchar(255),
    cores_number_id      int8,
    level_three_cache_id int8,
    socket_type_id       int8,
    tpd_id               int8,
    technical_process_id int8,
    threads_number_id    int8,
    primary key (id)
);
create table pump_noise_levels
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table socket_types
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table ssds
(
    id                            int8 not null,
    amount                        int4,
    name                          varchar(255),
    sequential_read_speed         int4,
    sequential_write_speed        int4,
    chip_type_id                  int8,
    drive_connection_interface_id int8,
    drive_form_factor_id          int8,
    drive_size_id                 int8,
    primary key (id)
);
create table system_blocks
(
    id                  int8 not null,
    amount              int4,
    name                varchar(255),
    price               float8,
    corp_id             int8,
    hdd_id              int8,
    motherboard_id      int8,
    power_supply_id     int8,
    processor_id        int8,
    processor_cooler_id int8,
    ssd                 int8,
    video_card_id       int8,
    primary key (id)
);
create table system_blocks_memories
(
    system_block_id int8 not null,
    memory_id       int8 not null
);
create table tdps
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table technical_processes
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table threads_numbers
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table vide_card_connection_interfaces
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table video_cards
(
    id                              int8 not null,
    amount                          int4,
    name                            varchar(255),
    vide_memory_frequency           int4,
    bus_bit_rate_id                 int8,
    video_card_connection_interface int8,
    video_memory_amount_id          int8,
    video_memory_type_id            int8,
    primary key (id)
);
create table video_memory_amounts
(
    id    int8 not null,
    value varchar(255),
    primary key (id)
);
create table video_memory_types
(
    id   int8 not null,
    name varchar(255),
    primary key (id)
);
create table water_block_materials
(
    id   int8 not null,
    type varchar(255),
    primary key (id)
);
create table water_cooling_system_case_materials
(
    id   int8 not null,
    type varchar(255),
    primary key (id)
);
create table water_cooling_systems
(
    id                                    int8 not null,
    amount                                int4,
    maximum_rotation_speed                int4,
    connection_type_id                    int8,
    fans_number_id                        int8,
    pump_noise_level_id                   int8,
    socket_type_id                        int8,
    water_block_material_id               int8,
    water_cooling_system_case_material_id int8,
    primary key (id)
);
alter table if exists corps
    add constraint FKnpnfwi9j14uwcd55jp7n8giaa foreign key (corp_color_id) references corp_colors;
alter table if exists corps
    add constraint FKk1pxrgqcw6qwn1nq9o1cx90nj foreign key (corp_motherboard_form_factor_id) references corp_motherboard_form_factors;
alter table if exists hdds
    add constraint FKfkjroe6ch2mx9vowahhu7mxcv foreign key (drive_connection_interface_id) references drive_connection_interfaces;
alter table if exists hdds
    add constraint FKcere9qs2vqx7li86jk04jmpxq foreign key (drive_form_factor_id) references drive_form_factors;
alter table if exists hdds
    add constraint FKgjlh96ihiidqtgqimk44g8ma0 foreign key (drive_size_id) references drive_sizes;
alter table if exists laptops
    add constraint FKaw7tsaahp8s7n8voxo3uwg4p1 foreign key (hdd_id) references hdds;
alter table if exists laptops
    add constraint FKkcyxyjtrforpd8g7x510hmdsd foreign key (processor_id) references processors;
alter table if exists laptops
    add constraint FK97hub5nblml8a1gn8530n9q6d foreign key (ssd) references ssds;
alter table if exists laptops
    add constraint FK44om9knjgvl9cay6fbge2hu8n foreign key (video_card_id) references video_cards;
alter table if exists laptops_memories
    add constraint FKg40jsm9p1203xg9qo30o59dtt foreign key (memory_id) references memories;
alter table if exists laptops_memories
    add constraint FKe3hrkxoww5cot99b9m7harvnn foreign key (laptop_id) references laptops;
alter table if exists memories
    add constraint FKawj0ogw4vhblh1bt94p5omkv9 foreign key (memory_type_id) references memory_types;
alter table if exists motherboards
    add constraint FKpggen8un3479m7n924d8xwyqu foreign key (corp_motherboard_form_factor_id) references corp_motherboard_form_factors;
alter table if exists motherboards
    add constraint FKnkvdv3hgagpgsyo2pqh3swkfb foreign key (memory_slots_number_id) references memory_slots_numbers;
alter table if exists motherboards
    add constraint FKsydbmn0a1b49h1fj6qo6u5b9k foreign key (memory_type_id) references memory_types;
alter table if exists motherboards
    add constraint FKmaeeg4unbv8hh6bns30sfxotf foreign key (socket_type_id) references socket_types;
alter table if exists power_supplies
    add constraint FK9xhe7c8dxc30mqs4rtx3h2jbu foreign key (efficiency_id) references efficiencies;
alter table if exists power_supplies
    add constraint FKou40i1u4th3js1979m9xhf6gu foreign key (power_id) references powers;
alter table if exists processor_coolers
    add constraint FKgowjxi9cpj8rwc98eweslldr0 foreign key (connection_type_id) references connection_types;
alter table if exists processor_coolers
    add constraint FK3y498qko0i3q0x3x20xesag7x foreign key (fans_number_id) references fans_numbers;
alter table if exists processor_coolers
    add constraint FKgvwk2vm8la2ek0x28n125x9md foreign key (socket_type_id) references socket_types;
alter table if exists processors
    add constraint FKis7ct3t5rqjlc1r4p37qickt3 foreign key (cores_number_id) references cores_numbers;
alter table if exists processors
    add constraint FKb4kj8pjaoo84ugabnsalu56gl foreign key (level_three_cache_id) references level_three_caches;
alter table if exists processors
    add constraint FKg8q5wjtg64apety00bba5fcx2 foreign key (socket_type_id) references socket_types;
alter table if exists processors
    add constraint FKylhflpoynnrsw4tgl9ym2o43 foreign key (tpd_id) references tdps;
alter table if exists processors
    add constraint FKj0xc88qq81x7w5u76a89m7iw foreign key (technical_process_id) references technical_processes;
alter table if exists processors
    add constraint FK1qsxobgevyq259caayfkdmw5x foreign key (threads_number_id) references threads_numbers;
alter table if exists ssds
    add constraint FKsscpnrlscqkhvhexkp0x0erl8 foreign key (chip_type_id) references chip_types;
alter table if exists ssds
    add constraint FK2pxoi4qdd539gfhhumg6q1atc foreign key (drive_connection_interface_id) references drive_connection_interfaces;
alter table if exists ssds
    add constraint FK6jxq8f7yd4pylqhgrgp48bw9n foreign key (drive_form_factor_id) references drive_form_factors;
alter table if exists ssds
    add constraint FKn3udrko20jvm4yopejbcc3199 foreign key (drive_size_id) references drive_sizes;
alter table if exists system_blocks
    add constraint FKcn7ckbs4b6w5kx0t38yy5ymoi foreign key (corp_id) references corps;
alter table if exists system_blocks
    add constraint FKdoeyhms603tcaaf7f46kxrcs8 foreign key (hdd_id) references hdds;
alter table if exists system_blocks
    add constraint FKliymrspatsfsc0ao365l13w9v foreign key (motherboard_id) references motherboards;
alter table if exists system_blocks
    add constraint FK7sjllx5qlik6nyyvxgn3ill6e foreign key (power_supply_id) references power_supplies;
alter table if exists system_blocks
    add constraint FKi1j1rcm544pd5124j5ex5wslf foreign key (processor_id) references processors;
alter table if exists system_blocks
    add constraint FK73in5jfb5lr2w7yywg8g9pbmi foreign key (processor_cooler_id) references processor_coolers;
alter table if exists system_blocks
    add constraint FKfjrxwgj6kr75qg2iqjrplw0oe foreign key (ssd) references ssds;
alter table if exists system_blocks
    add constraint FK53pf08s4joge10a7mkspsldy3 foreign key (video_card_id) references video_cards;
alter table if exists system_blocks_memories
    add constraint FKalph5i22da24dxm8ryucaqjfy foreign key (memory_id) references memories;
alter table if exists system_blocks_memories
    add constraint FKh1ulahocdely3kdle2dm641mh foreign key (system_block_id) references system_blocks;
alter table if exists video_cards
    add constraint FK6k1e8eal9j0idfhqjuiq3loak foreign key (bus_bit_rate_id) references bus_bit_rates;
alter table if exists video_cards
    add constraint FKs5pe79gqrbwud7b8uaayalab6 foreign key (video_card_connection_interface) references vide_card_connection_interfaces;
alter table if exists video_cards
    add constraint FKg7ffthd7hvhnq728m7oly4u6 foreign key (video_memory_amount_id) references video_memory_amounts;
alter table if exists video_cards
    add constraint FKnvw8nd57ghjmarjty09homs31 foreign key (video_memory_type_id) references video_memory_types;
alter table if exists water_cooling_systems
    add constraint FKcd3c46fnasr02lrdejkaw6ckd foreign key (connection_type_id) references connection_types;
alter table if exists water_cooling_systems
    add constraint FKfc1k9s9s5ogh6h9v88v5l0jfe foreign key (fans_number_id) references fans_numbers;
alter table if exists water_cooling_systems
    add constraint FK86d6s79awnvflmvo01sdg64jx foreign key (pump_noise_level_id) references pump_noise_levels;
alter table if exists water_cooling_systems
    add constraint FK2en8a43nf01kj05q76p98nj42 foreign key (socket_type_id) references socket_types;
alter table if exists water_cooling_systems
    add constraint FKmyhia4watgdv57xx9ena6lbne foreign key (water_block_material_id) references water_block_materials;
alter table if exists water_cooling_systems
    add constraint FK11bn0mi3l45w6p1koxrqk3io8 foreign key (water_cooling_system_case_material_id) references water_cooling_system_case_materials;