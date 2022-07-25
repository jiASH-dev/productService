package com.jiash.productservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "processors")
@Getter
@Setter
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
    @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_processorId", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "socket_type_id")
    private SocketType socketType;

    @OneToOne
    @JoinColumn(name = "cores_number_id")
    private CoresNumber coresNumber;

    @OneToOne
    @JoinColumn(name = "threads_number_id")
    private ThreadsNumber threadsNumber;

    @Column(name = "frequency")
    private Double frequency;

    @OneToOne
    @JoinColumn(name = "level_three_cache_id")
    private LevelThreeCache levelThreeCache;

    @OneToOne
    @JoinColumn(name = "technical_process_id")
    private TechnicalProcess technicalProcess;

    @OneToOne
    @JoinColumn(name = "tpd_id")
    private Tdp tdp;

    @Column(name = "amount")
    private Integer amount;

    @Entity
    @Table(name = "cores_numbers")
    @Getter
    @Setter
    public static class CoresNumber {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_coresNumberId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private ECoresNumberValue value;

        public enum ECoresNumberValue {
            FOUR, SIX, EIGHT, TWELVE, TWENTY_FOUR, THIRTY_TWO, SIXTY_FOUR
        }
    }

    @Entity
    @Table(name = "level_three_caches")
    @Getter
    @Setter
    public static class LevelThreeCache {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_levelThreeCacheId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private ELevelThreeCacheValue value;

        public enum ELevelThreeCacheValue {
            SIXTEEN, THIRTY_TWO, SIXTY_FOUR
        }
    }

    @Entity
    @Table(name = "tdps")
    @Getter
    @Setter
    public static class Tdp {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_tpdId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private ETdpValue value;

        public enum ETdpValue {
            NINETY_FIVE, SIXTY_FIVE
        }
    }

    @Entity
    @Table(name = "technical_processes")
    @Getter
    @Setter
    public static class TechnicalProcess {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_technicalProcessId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private ETechnicalProcessValue value;

        public enum ETechnicalProcessValue {
            THIRTY_TWO, TWENTY_FOUR, TWENTY_TWO, EIGHTEEN, SIXTEEN, FOURTEEN
        }
    }

    @Entity
    @Table(name = "threads_numbers")
    @Getter
    @Setter
    public static class ThreadsNumber {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_idGenerator")
        @SequenceGenerator(name = "seq_idGenerator", sequenceName = "seq_threadsNumberId", allocationSize = 1)
        @Column(name = "id")
        private Long id;

        @Column(name = "value")
        @Enumerated(value = EnumType.STRING)
        private EThreadsNumberValue value;

        public enum EThreadsNumberValue {
            EIGHT, TWELVE, SIXTEEN, TWENTY_FOUR, THIRTY_TWO, SIXTY_FOUR
        }
    }
}

